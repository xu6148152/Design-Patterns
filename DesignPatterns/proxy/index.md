###定义：
定义了算法族，分别封装起来，让它们之间可以互相替换，让算法的变化独立于使用算法的客户 
![](./uml.png)
###应用场景：
* a remote proxy provides a local representative for an object in a different address space.(远程代理)
* a virtual proxy creates expensive objects on demand.(虚拟代理)
* a protection proxy controls access to the original object. Protection proxies are useful when objects 
  should have different access rights.
  
###真实案例:
* Proxy AIDL Binder