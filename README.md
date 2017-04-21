# CustomClickListener

转载请注明出处：http://www.cnblogs.com/cnwutianhao/p/6694072.html 

 

在做App的过程中，当点击某个按钮的时候，如果不做连点处理，会造成按钮在短时间内被点击多次的情况。


本文采用Data-Binding框架,So 在build.gradle(Module:app)下面添加

android {
    ...
    dataBinding {
        enabled = true
    }
}

