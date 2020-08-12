const trialarilaro=[3,8,10298,77,1,55,14,21,19,9098];
       
        for(let i=0;i<trialarilaro.length-1;i++){
            for (let j=0;j<trialarilaro.length-1-i;j++){
                if (trialarilaro[j]>trialarilaro[j+1]){
                    let temp=trialarilaro[j];
                    trialarilaro[j]=trialarilaro[j+1];
                    trialarilaro[j+1]=temp;
                }
            }
        }
console.log(trialarilaro);