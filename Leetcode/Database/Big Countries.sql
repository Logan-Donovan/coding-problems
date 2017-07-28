--Problem: https://leetcode.com/problems/big-countries/tabs/description/
SELECT name,population,area FROM World WHERE population>25000000 OR area>3000000;
