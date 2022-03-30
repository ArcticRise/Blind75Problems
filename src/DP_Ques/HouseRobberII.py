def rob(nums):
    if len(nums) == 1:
        return nums[0]

    def dp_func(nums):
        r1, r2 = 0, 0

        for n in nums:
            temp = max(n + r1, r2)
            r1 = r2
            r2 = temp
        return r2

    return max(dp_func(nums[1:]), dp_func(nums[:-1]))

print(rob([2,3,2]))