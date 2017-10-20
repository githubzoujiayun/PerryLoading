## PerryLoading
一个简洁好看的loading弹窗

###### Gif看起来有些卡顿，但在手机上很流畅的。

![img](http://perry.ren/img/perryloading.gif)

### 依赖：</br>
----------
##### Step 1.
添加Jitpack到您的root gradle，如果无法导包，一般情况下都是这个原因，请仔细检查
 ```xml
    allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }
 ```
##### Step 2.
在需要使用到的Module中添加以下依赖
 ```xml
    dependencies {
		compile 'com.github.weipeilong123:PerryLoading:1.0.1'
	}
 ```

### 使用：</br>

```java
    LoadingDialog dialog = new LoadingDialog(context);
    dialog.setMsg("请稍等...");
    dialog.setNotCancel();  //设置dialog不自动消失
    dialog.show();
```