# KKDialog
[![license](https://img.shields.io/badge/license-Apache%202-blue.svg?maxAge=2592000)](https://github.com/obamakang/KKDialog/blob/master/LICENSE)

`KKDialog` 是一个通过 `DialogFragment` 实现的底部弹窗布局，并且支持弹出动画，支持任意布局
## Import

Maven

    <dependency>
      <groupId>me.obamakang</groupId>
      <artifactId>KKDialog</artifactId>
      <version>1.1.9</version>
      <type>pom</type>
    </dependency>
    
or Gradle

	compile 'obamakang:KKDialog:1.1.9'

## Uasge

你可以通过两种不同的方式来使用 `KKDialog`：

### 1.直接使用 `KKDialog`

简单的三行代码就可以搞定
    
    KKDialog.create(getSupportFragmentManager())
                    .setLayoutRes(R.layout.dialog_layout)      // dialog layout
                    .show();
                    
当然，你也可以进行简单的设置

    KKDialog.create(getSupportFragmentManager())
                    .setViewListener(new KKDialog.ViewListener() {      // 可以进行一些必要对View的操作
                        @Override
                        public void bindView(View v) {
                            // you can do bind view operation
                        }
                    })
                    .setLayoutRes(R.layout.dialog_layout)  
                    .setDimAmount(0.1f)            // Dialog window 背景色深度 范围：0 到 1，默认是0.2f
                    .setCancelOutside(false)     // 点击外部区域是否关闭，默认true
                    .setTag("KKDialog")     // 设置DialogFragment的tag
                    .show();

So Easy！

### 2.或者继承 `BaseKKDialog` 使用

首先根据自己的需求定义一个 Dialog 类，继承`BaseKKDialog`，比如下方的`ShareKKDialog`
    
    public class ShareKKDialog extends BaseKKDialog{
    
        @Override
        public int getLayoutRes() {
            return R.layout.dialog_layout;
        }
    
        @Override
        public void bindView(View v) {
            // do any thing you want
        }
    }

还是那么简单，只需要实现两个抽象方法就大功告成，剩下的就是添加自己的逻辑。
当然，你也可以重写一些必要的方法来满足自己的需求

    int getHeight()                 // 设置 KKDialog 的高度

    float getDimAmount()            // 设置 dialog 所在 window 的背景深度，默认0.2f

    boolean getCancelOutside()      // 设置 dialog 点击外部区域是否消失

    String getFragmentTag()         // 设置 dialogFragment 的 tag

调用方法：

        ShareKKDialog dialog = new ShareKKDialog();
        dialog.show(getSupportFragmentManager());

完成！

## Issue

如果大家在使用的过程中，遇到什么问题，欢迎大家提issue

## License

    Copyright 2018 obamakang

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
	
 
 
