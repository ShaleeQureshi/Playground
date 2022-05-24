#include <iostream>
#include <unordered_set>

using namespace std;

struct Hash
{
    int hash = 0;
    int hist[26] = {0};

    Hash(string st)
    {
        for (char &c : st)
        {
            add(c);
        }
    }

    void pop(char c)
    {
        hash ^= c;
        hist[c - 'a']--;
    }

    void add(char c)
    {
        hash ^= c;
        hist[c - 'a']++;
    }

    void histPrint()
    {
        for (int i = 0; i < 26; i++)
        {
            char c = 'a' + i;
            cout << c << ": " << hist[i] << endl;
        }
    }

    bool operator==(const Hash &other) const
    {
        return std::equal(begin(hist), end(hist), begin(other.hist));
    }
};

int main()
{
    string n, m;
    cin >> n >> m;

    size_t windowLen = n.length();
    size_t wordLen = m.length();

    if (wordLen < windowLen)
    {
        cout << 0;
        return 0;
    }

    Hash primary = Hash(n);
    Hash window = Hash(m.substr(0, windowLen));

    unordered_set<string> perm;

    for (size_t i = 0; i <= wordLen - windowLen; i++)
    {
        if (primary.hash == window.hash && primary == window)
        {
            perm.insert(m.substr(i, windowLen));
        }
        window.pop(m[i]);
        window.add(m[i + windowLen]);
    }

    cout << perm.size();
}
