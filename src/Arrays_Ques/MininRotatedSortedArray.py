def findMin(nums):
    ans = nums[0]
    left,right = 0,len(nums)-1
    while left <= right:
        if nums[left] <= nums[right]:
            ans = min(ans,nums[left])
            break
        mid = (left+right)//2
        if nums[mid] >= nums[left]:
            left = mid + 1
        else:
            right = mid - 1
    return ans


print(findMin([3,4,5,1,2]))

