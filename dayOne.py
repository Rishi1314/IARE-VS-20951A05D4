# # Weekly salary question
# def salary(x,y,m):
#     return (m*y)/x
# m=int(input("Enter X/Y th amount of your weekly salary:"))
# x,y=map(int,input("Enter X/Y").split("/"))
# ans=salary(x,y,m)
# print("Your weekly salary is:",ans)
# a,b=map(int,input("Enter X and Y of your salary that you want to find").split("/"))
# print((ans*a)/b)
# import datetime;
# ans=[i for i in input("String")][::-1]
# ct = datetime.datetime.now()
# print("current time:-", ct)
# print(ans)
# ct = datetime.datetime.now()
# print("current time:-", ct)
import datetime;

# ans=[i for i in input()]
ans=input()
def fun(x):
    if len(x)==1:
        return x
    mid=len(x)//2
    return fun(x[mid:])+fun(x[:mid])
# def fun(x):
#     i=0
#     j=len(x)-1
#     while(i<j):
#         x[i],x[j]=x[j],x[i]
#         i+=1
#         j-=1
#     return "".join(x)
a= datetime.datetime.now()
print(a)
print(fun(ans))
b = datetime.datetime.now()
print(b)


















# reverse of a substring using recursion and multithreading. input a paragraph

