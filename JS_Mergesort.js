
 let kikirikou=[1,5,4,88,3,100,41];
 kikirikou=mergeSort(kikirikou);
 console.log(kikirikou);

function mergeSort (array) {
    if (array.length <2) {
      return array;
    }
    
    const m= Math.floor(array.length/2);
    const le =array.slice(0, m);
    const r= array.slice(m);
  
    // recursion
   return merge(mergeSort(le), mergeSort(r),m,array.length-m);  
}

function merge(le,r,ld,rd){
    let i=0,j=0;
    let array=[];

    while(i<ld && j<rd){
        if(le[i]<=r[j]){
            array.push(le[i]);
            i++;
        }else
            {
            array.push(r[j]);
            j++;
        }
    }

    while(i<ld){
        array.push(le[i]);
        i++;
    }

    while(j<rd){
        array.push(r[j]);
        j++;
    }

    return array;
}



