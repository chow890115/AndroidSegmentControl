# AndroidSegmentControl

## Introduction
A android custom view works like SegmentControl in IOS

## Usage

* Add the below code in you layout xml file
``` XML
<com.huibin.androidsegmentcontrol.SegmentControl
        xmlns:segmentcontrol="http://schemas.android.com/apk/res-auto"
        android:id="@+id/segment_control"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="15sp"
        segmentcontrol:texts="未签到|全部|已签到" <!--标签的内容-->
        segmentcontrol:selectedBackgroundColors="#e00032"<!--被选中按钮的背景-->
        segmentcontrol:cornerRadius="5dip"
        segmentcontrol:direction="horizon" <!--标签的显示的方向-->
        segmentcontrol:verticalGap="8dip"
        segmentcontrol:horizonGap="8dip"
        segmentcontrol:selectedIndex="1"/><!--默认选中哪个标签,默认是0,当大于标签的个数就默认选中为最后一个标签-->
```
* Then add these code

``` Java
SegmentControl segmentControl = (SegmentControl) findViewById(R.id.segment_control);
segmentControl.setOnSegmentControlClickListener(new SegmentControl.OnSegmentControlClickListener() {
    @Override 
    public void onSegmentControlClick(int index) {
        //处理点击标签的事件
    } 
}); 
```
* Enjoy yourself

## Screen snapshot
![snapshot](https://github.com/liuhuibin/AndroidSegmentControl/blob/master/.raw/snapshot.jpg)

License
============

    The MIT License (MIT)


    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
