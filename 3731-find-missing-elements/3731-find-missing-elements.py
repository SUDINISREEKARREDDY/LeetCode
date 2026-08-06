class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        miss = []
        nums.sort()
        for i in range(len(nums)-1):
            if nums[i+1] != nums[i] + 1:
                for j in range(nums[i] + 1, nums[i+1]):
                    miss.append(j)
        return miss