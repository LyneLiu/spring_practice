关于Java注解和XML配置方式的混合使用，主要有两种方式：
1、@Configuration和@Import的配合使用——@Import导入配置Class，其中的@Bean添加bean至容器，@ImportResource导入配置文件；
2、@Configuration和XML配置文件的使用——@Configuration的Class中注解@Bean添加bean至容器，Xml配置文件结合其实现混合使用。