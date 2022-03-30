def lengthOfLIS(nums):
    dp = [1] * len(nums)
    for i in range(len(nums) - 1, -1, -1):
        for j in range(i + 1, len(nums)):
            if nums[i] < nums[j]:
                dp[i] = max(dp[i], 1 + dp[j])
    return max(dp)


def lengthOfLISTopDown(nums):
    dp = [1] * len(nums)
    for i in range(1,len(nums)):
        for j in range(i):
            if nums[i] > nums[j]:
                dp[i] = max(dp[i], 1 + dp[j])
    return max(dp)

#Bottom Up Appoach
print(lengthOfLIS([10,9,2,5,3,7,101,18]))

#Top Down Approach
print(lengthOfLISTopDown([10,9,2,5,3,7,101,18]))