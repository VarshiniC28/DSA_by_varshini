'''You are given a string A of size N.
Return the string A after reversing the string word by word.'''

class Solution:
    def solve(self, A: str):
        words = A.strip().split()
        words.reverse()
        return " ".join(words)

# Creating an instance of Solution
solution = Solution()

# Taking input from the user
A = input("Enter the string: ")

# Calling the solve function and printing the result
print(solution.solve(A))


