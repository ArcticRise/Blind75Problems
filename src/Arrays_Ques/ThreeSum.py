def threeSum(nums):
    nums.sort()
    ans = []
    for i in range(len(nums)):
        if i > 0 and nums[i] == nums[i-1]:
            continue
        left,right = i+1, len(nums)-1
        while left < right:
            sum = nums[i] + nums[left] + nums[right]
            if sum > 0:
                right -= 1
            elif sum < 0:
                left += 1
            else:
                ans.append([nums[i],nums[left],nums[right]])
                left += 1
                while nums[left] == nums[left-1] and left < right:
                    left += 1
    return ans

print(threeSum([-1,0,1,2,-1,-4]))