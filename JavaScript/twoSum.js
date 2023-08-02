/*O(n) time complexity*/
var twoSum = (nums, target,) => {
    const history = new Map();
    for (let idx = 0; idx < nums.length; idx++) {
        const num = nums[idx];
        const complement = (target - num);
        const sumIdx = history.get(complement);

        const isTarget = history.has(complement)
        if (isTarget) return [ idx, sumIdx ];

        history.set(num, index);                        
    }
}
