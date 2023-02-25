# Weekly salary question
def salary(x,y,m):
    return (m*y)/x
m=int(input("Enter X/Y th amount of your weekly salary:"))
x,y=map(int,input("Enter X/Y").split("/"))
ans=salary(x,y,m)
print("Your weekly salary is:",ans)
a,b=map(int,input("Enter X and Y of your salary that you want to find").split("/"))
print((ans*a)/b)
