public int RectCover(int target) {
        //n=1（1），n=2（2），横（n-1），竖（n-2）
        if(target<=2)
            return target;
        int first=1,second=2,res=0;
        for(int i=3;i<=target;i++){
            res=first+second;
            first=second;
            second=res;
        }
        return res;
    }