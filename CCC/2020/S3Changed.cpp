#include <iostream>
#include <map>
#include <string>

using namespace std;

bool isPerm(map<char, int> map1, map<char, int> map2);
int main()
{

    string needle, haystack;
    cin >> needle >> haystack;

    map<char, int> freq_needle, freq_hay;

    for (int i = 0; i < needle.size(); i++)
    {
        freq_needle[needle[i]]++;
    }
    int count = 0;
    map<size_t, bool> used;
    for (int i = 0; i < haystack.size() - needle.size() + 1; i++)
    {
        string h_substr = haystack.substr(i, needle.size());
        if (i == 0)
        {
            for (int j = 0; j < h_substr.size(); j++)
            {
                freq_hay[h_substr[j]]++;
            }
        }
        else
        {
            char removed = haystack[i - 1], added = haystack[i + h_substr.size() - 1];
            freq_hay[added]++;
            freq_hay[removed]--;
        }
        hash<string> hasher;
        size_t hash = hasher(h_substr);
        if (isPerm(freq_needle, freq_hay) && !used[hash])
        {
            used[hash] = true;
            count++;
        }
    }
    cout << count;
    return 0;
}

bool isPerm(map<char, int> map1, map<char, int> map2)
{

    for (int i = 0; i < 26; i++)
    {
        char letter = 'a' + i;
        if (map1[letter] != map2[letter])
        {
            return false;
        }
    }
    return true;
}