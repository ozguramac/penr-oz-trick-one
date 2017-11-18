Trick One
---------

Transform matrix

     {0,0,0,0,0}
    ,{0,0,0,0,0}
    ,{0,0,1,0,0}
    ,{0,1,0,1,0}
    ,{0,0,0,0,0}

to

     {0,0,0,0,0}
    ,{0,0,1,0,0}
    ,{0,1,1,1,0}
    ,{1,1,1,1,1}
    ,{0,1,0,1,0}


in-place without using any other variable or array allocated.