#include <bits/stdc++.h>

using namespace std;

bool isSorted(vector<int> arr)
{
    if (arr.size() <= 1)
    {
        return true;
    }

    vector<int> copy(arr);
    vector<int> sorted;
    int max = -1e7;

    do
    {
        random_shuffle(begin(copy), end(copy));
        vector<int> small = {copy.begin(), copy.end() - 1};

        while (!isSorted(small))
        {
            random_shuffle(begin(small), end(small));
        }

        sorted = small;

        for (int i = 0; i < (int) sorted.size(); i++)
        {
            if (sorted[i] > max)
            {
                max = sorted[i];
            }
        }

    }
    while (copy[copy.size() - 1] < max);

    for (int i = 0; i < (int) sorted.size();i++)
    {
        copy[i] = sorted[i];
    }

    for (int i = 0; i < (int) arr.size(); i++)
    {
        if (copy[i] != arr[i])
        {
            return false;
        }
    }

    return true;
}

int main()
{
    cin.tie(0)->sync_with_stdio(0);

    vector<int> bogo;
    string nums;
    int num;
    getline(cin, nums);
    stringstream s(nums);

    while (s >> num)
    {
        bogo.push_back(num);
    }

    while (!isSorted(bogo))
    {
        random_shuffle(begin(bogo), end(bogo));
    }

    for (int i = 0; i < (int) bogo.size(); i++)
    {
        cout << bogo[i] << " ";
    }
    
    cout << "\n";
}