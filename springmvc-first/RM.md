![alt text](spring_dispatcherservlet.png "DispatcherServlet")

>组件及其作用:
* 前端控制器(DispatcherServlet)：接收请求，响应结果，相当于转发器，中央处理器。减少了其他组件之间的耦合度  
* 处理器映射器(HandlerMapping)：根据请求的url查找Handler  
* Handler处理器(Controller)：按照HandlerAdapter的要求编写  
* 处理器适配器(HandlerAdapter)：按照特定规则(HandlerAdapter要求的规则)执行Handler。  
* 视图解析器(ViewResolver)：进行视图解析，根据逻辑视图解析成真正的视图(View)  
* 视图(View)：View是一个接口实现类试吃不同的View类型（jsp,pdf等等)  

>DispatcherServlet的传入HTTP请求的事件顺序：
* 在接收到HTTP请求后，DispatcherServlet会查询HandlerMapping以调用相应的Handler(可根据xml配置、注解进行查找)
* DispatcherServlet调用HandlerAdapter执行Handler
* Handler执行完，给HandlerAdapter返回ModelAndView(Springmvc框架的一个底层对象)。HandlerAdapter再将其返回给DispatcherServlet
* DispatcherServlet请求ViewResolver进行视图解析，根据逻辑视图名解析成真正的视图View
* DispatcherServlet进行视图渲染，即将模型数据(在ModelAndView对象中)填充到request域
* DispatcherServlet向用户响应结果

