###定义:
异步方法模式使调用者线程不会一直被阻塞直到结果返回。该模式使多个独立的任务并行处理，通过回调来获取结果或者等到什么都做完了。

###应用场景:
* 你有多个独立的任务想要并行运行
* 你需要改善一组串行任务的性能
* 你限制了线程数量或者需要长时间运行某些任务，但不想要调用者一直等待直到任务完成

###真实案例
* [FutureTask](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/FutureTask.html), [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html), [ExecutorService](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)
* [Task-based Asynchronous Pattern](https://msdn.microsoft.com/en-us/library/hh873175.aspx)(.NET)