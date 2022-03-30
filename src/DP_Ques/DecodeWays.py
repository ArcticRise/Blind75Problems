def numDecodings(s):
    dp = {len(s): 1}

    def dfs(posString):
        if posString in dp:
            return dp[posString]
        if s[posString] == '0':
            return 0

        ans = dfs(posString + 1)
        if (posString + 1 < len(s) and (s[posString] == "1"
                                        or s[posString] == "2" and s[posString + 1] in "0123456")):
            ans += dfs(posString + 2)
        dp[posString] = ans
        return ans

    return dfs(0)

print(numDecodings("12"))