###定义:
将类的接口转变才能期望的接口。适配器使类不会因为不兼容的接口而无法一起工作。
![](https://github.com/xu6148152/Design-Patterns/blob/master/DesignPatterns%2Fadapter%2Fadapter.png)
###适用场景:
* 当你想要适用一个已经存在的类,但它的接口无法满足你的需求
* 当你想创建一个可复用的类，与其他不相关的类合作，也就是类不需要有兼容的接口
* 你需要使用几个已经存在的子类，但它们的接口无法适配它们所有的子类一个对象适配器能够适配它的父类的接口

###真实例子
[java.util.Arrays#asList()](http://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#asList%28T...%29)
