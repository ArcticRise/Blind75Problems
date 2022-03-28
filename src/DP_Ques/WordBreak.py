def wordBreak(s,wordDict):
    dp = [False] * (len(s) + 1)
    dp[len(s)] = True
    for i in range(len(s) - 1, -1, -1):
        for word in wordDict:
            if (i + len(word)) <= len(s) and word == s[i:i + len(word)]:
                dp[i] = dp[i + len(word)]
            if dp[i] == True:
                break
    return dp[0]

def wordBreakTopDown(s,wordDict):
    dp = [False] * (len(s) + 1)
    dp[0] = True
    for i in range(1,len(s)+1):
        for word in wordDict:
            if s[i - len(word):i] == word and (i - len(word) == 0 or dp[i - len(word)]):
                dp[i] = dp[i - len(word)]
            if dp[i] == True:
                break
    return dp[-1]


print(wordBreak("leetcode",["leet","code"]))
print(wordBreakTopDown("leetcode",["leet","code"]))

