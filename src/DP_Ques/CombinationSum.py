def combinationSum(candidates,target):
    ans = []

    def backtrack(i, cur, total):
        if total == target:
            ans.append(cur.copy())
            return
        if i >= len(candidates) or total > target:
            return
        cur.append(candidates[i])
        backtrack(i, cur, total + candidates[i])
        cur.pop()
        backtrack(i + 1, cur, total)

    backtrack(0, [], 0)
    return ans

print(combinationSum([2,3,6,7], 7))

