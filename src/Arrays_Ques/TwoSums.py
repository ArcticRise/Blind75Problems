
nums = [2,7,11,15]
map_ = {}
target = 9


def twoSums(nums, target):
    for i in range(len(nums)):
        if target-nums[i] in map_:
            return [map_[target-nums[i]],i]
        map_[nums[i]] = i
    return

print(twoSums(nums,target))