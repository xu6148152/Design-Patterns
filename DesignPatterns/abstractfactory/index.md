###定义:
为创建一组相关或者相互依赖的对象提供一个接口，而不用指定它们具体的类.

![uml]()
###使用场景:
* 一个系统独立于它的产品如何创建，组装和呈现
* 一个系统应该被一种或者多种产品配置
* 一组相关产品对象被设计来一起使用，你需要强制这种约束
* 你想要提供产品的类库，你只想要暴露它们的接口，而不是它们的实现。

###真实例子
* [DocumentBuilderFactory](http://docs.oracle.com/javase/8/docs/api/javax/xml/parsers/DocumentBuilderFactory.html)