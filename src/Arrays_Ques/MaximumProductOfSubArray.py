import sys


def maxProduct(nums):
    ans = max(nums)
    curMin,curMax = 1,1,
    for i in nums:
        #use old curMax since curmax is bneing modified
        temp = i*curMax
        curMax = max(i*curMin,i*curMax,i)
        curMin = min(temp,i*curMin,i)
        ans = max(curMax,ans)
    return ans

print(maxProduct([2,3,-2,4]))