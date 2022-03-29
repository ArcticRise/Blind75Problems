def rob(nums):
    r1, r2 = 0, 0

    for n in nums:
        temp = max(n + r1, r2)
        r1 = r2
        r2 = temp
    return r2

print(rob([1,2,3,1]))