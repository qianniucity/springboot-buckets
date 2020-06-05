#### Docker 配置 zookeeper + dubbo-admin
[docker启动zookeeper](./dubbo-stack.yml)

#### 负载均衡策略
- random  随机
- roundrobin 轮询
- leastactive 最少活跃调用数
- consistenthash 一致性 Hash

#### [Dubbo的超时容错机制](https://zhuanlan.zhihu.com/p/88378921)
- 是指当A服务调用B服务超时后，Dubbo默认会执行重试的机制，尝试去调用集群的其他机器，默认是重试两次，即加上第一次调用，总共是三次。

#### [Dubbo提供多版本的配置](https://zhuanlan.zhihu.com/p/88380135)
Dubbo提供多版本的配置，方便我们做服务的灰度发布，或者是解决不兼容的问题。

#### [Dubbo的本地存根](https://zhuanlan.zhihu.com/p/88381605)
- 方便对传入的参数做统一的处理