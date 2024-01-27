function pangrams(s) {
    s = s.toLowerCase().split(" ").join("");
    const letterCount = {};
  
    if (s.length <26) return false
  
    for (const char of s) {
        letterCount[char] = (letterCount[char] || 0) + 1;
    }
    const isPangram = Object.keys(letterCount).length === 26;
  
    return isPangram;
  }
