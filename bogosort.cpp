#include <bits/stdc++.h>

using namespace std;

bool isSorted(vector<int> arr, int size)
{
    while(size > 1)
    {
        size--;
        if (arr[size] < arr[size - 1])
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

    int size = bogo.size();
    bool sorted = false;

    while(!sorted)
    {
        random_shuffle(begin(bogo), end(bogo));
        if (isSorted(bogo, size))
        {
            sorted = true;
        }
    }

    for (int i = 0; i < (int) bogo.size(); i++)
    {
        cout << bogo[i] << " ";
    }
    
    cout << "\n";

}