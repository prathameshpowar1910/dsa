/**
 * @param {number[]} candyType
 * @return {number}
 */

var distributeCandies = function (candyType) {
    // candyType = candyType.sort((a,b)=>a-b)
    // const n = candyType.length
    // let res = 1;
    // let prev = candyType[0];
    // let idx = 1;
    // while (res < (n/2) && idx<n) {
    //     if (candyType[idx] != prev ) res++
    //     prev = candyType[idx]
    //     idx++
    // }

    // return res
    
    // const set = new Set(candyType);
    // const n = candyType.length;
    // const candiesLen = n / 2;
    // let max = -Infinity;

    // if (set.size === candiesLen) {
    //     max = Math.max(max, candiesLen);
    // }
    // if (set.size !== candiesLen) {
    //     max = Math.min(set.size, candiesLen);
    // }
    // return max;

    const set = new Set(candyType)
    const countCandy = candyType.length / 2;
    return set.size < countCandy ? set.size  : countCandy
};
