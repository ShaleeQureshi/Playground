#include <iostream>
#include <map>
#include <queue>
#include <unordered_map>
#include <vector>

using namespace std;

struct Position
{
    int row;
    int col;
    bool foundWayOut;

    bool isOut()
    {
        return row == 1 && col == 1;
    }

    bool op(const Position &other) const
    {
        return row == other.row && col == other.col;
    }

    int product()
    {
        return row * col;
    }
};
bool bounds(unordered_map<int, vector<Position>> max, Position root);

int main()
{
    int row, col;
    cin >> row >> col;
    unordered_map<int, vector<Position>> max;

    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            int z;
            cin >> z;
            max[z].push_back({i + 1, j + 1});
        }
    }
    if (bounds(max, {row, col}))
    {
        cout << "yes";
    }
    else
    {
        cout << "no";
    }
    return 0;
}

bool bounds(unordered_map<int, vector<Position>> max, Position root)
{
    queue<Position> que;

    root.foundWayOut = true;
    que.push(root);
    while (que.empty() == false)
    {
        Position currentPosition = que.front();
        if (currentPosition.isOut())
        {
            return true;
        }
        vector<Position> edges = max[currentPosition.product()];
        for (auto i = edges.begin(); i != edges.end(); i++)
        {
            if (!i->foundWayOut)
            {
                i->foundWayOut = true;
                que.push(*i);
            }
        }
        que.pop();
    }
    return false;
}