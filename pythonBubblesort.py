trialarilaro=[3,8,10298,77,1,55,14,21,19,9098]
for i in range(0,len(trialarilaro)-1):
  for j in range(0,len(trialarilaro)-i-1):
    trialarilaro[j],trialarilaro[j+1]=trialarilaro[j+1],trialarilaro[j]
	
print(trialarilaro)