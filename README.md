# 这是一个创建社区的代码

## 资料

[themleaf](https://spring.io/guides/gs/serving-web-content/)

[bootstrap框架](https://v3.bootcss.com/components/#navbar)

[githubAPP](https://developer.github.com/apps/)

[h2](http://www.h2database.com/html/main.html)

[maven仓库](https://mvnrepository.com/)

[flyway maven](https://flywaydb.org/getstarted/firststeps/maven)

[lombok maven](https://www.projectlombok.org/setup/mave)

[内网穿透](https://natapp.cn/)

[Spring MVC官方文档](https://docs.spring.io/spring/docs/5.0.3.RELEASE/spring-framework-reference/web.html#spring-web)

[generator](http://www.mybatis.org/generator/index.html)

[js的moment工具包](http://momentjs.cn/docs/)

[富文本编辑器](https://pandao.github.io/editor.md/)


## 脚本操作：
```
mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```


## idea快捷键

ctrl+F12：快速查询所有继承，查询类中所有方法

shift+shift：快捷查询文件

shift+F6：重命名

Ctrl+alt+l：自动格式化

ctrl+shift+↑：当前语句上移

shift+enter：不破坏代码的换行

ctrl+alt+←：回退至上一次的页面

双击标签：全屏显示

alt+F7：找到所有依赖此方法的类

ctrl+d：拷贝一行至下一行

ctrl+alt+m：抽出方法

ctrl+alt+n：收回变量

Ctrl+shift+v：抽出实例

ctrl+alt+p：从方法中抽出变量至参数列表

ctrl+p：查看所需参数

### 思路：
1. 由页面路径创建controller，controller内方法（返回值为该页面）接收前端信息，并将数据传到页面（model）

2. 由方法创建mapper，mapper中定义含sql注解的接口
（若页面元素不止一张表的内容，则用dto创建新表关联两表，再提取出service，在service中先创建该方法，再在mapper中创建）

3. 编写页面

## 部署
###依赖
- git 下载代码
- jdk 编译
- maven 构建项目
- mysql 数据库
### 步骤
- yum update 更新最新包
- yum install git 安装git
- mkdir App
- cd App
- git clone https://github.com/...项目地址
- yum install maven 安装了maven和java8
- mvn -v 显示版本号
- mvn compile package 


## Spring Boot项目所用技术
- springboot
- IDEA
- refactor
- source code
- git/github
- bootstrap
- github authorization
- properties
- session & cookies
- mysql/h2
- mybatis
- distribution session
- flyway 持续的脚本更新
- lombok
- dev tools 热部署
- pagination 分页插件
- interceptor 拦截处理业务需求
- MBG mybatis快速生成
- exception handler 全文处理异常
- restful/json 
- markdown
- image upload
- logging
- profile
- deploy



#### jsp基础学习
 jsp九大内置对象(常用前5个，前2个可以获取所有其他对象)
 
 | 名称 | 类型 | 含义 | 获取方式 |
 | ------ | ------ | ------ | ------ |
 | request | HttpServletRequest | 封装所有请求信息 | 方法参数 |
 | response | HttpServletResponse | 封装所有响应信息 | 方法参数 |
 | session | HttpSession | 封装所有会话信息 | request.getSession(); |
 | application | ServletContext | 所有信息 | getServletContext();request.getServletContext(); |
 | out | PrintWriter | 输出对象 | response.getWriter(); |
 | exception | Exception | 异常对象 |
 | page | Object | 当前页面对象 |
 | pageContext | pageContext | 获取其他对象 |
 | config | ServletConfig | 配置信息 |

jsp四大作用域
- page：在当前页面不会重新实例化。
- request：在一次请求中是同一个对象，下次请求重新实例化一个request。在一次请求结束后被销毁。
- session：只要客户端Cookie传递的Jsessionid不变,session不会重新实例化（不超过默认时间）
    - 实际有效时间：1. 浏览器关闭，Cookie失效2. 默认时间（在Tomcat的web.xml中配置）范围内无任何交互
- application：只有在Tomcat启动项目时实例化，关闭Tomcat时销毁

SpringMVC作用域传值的方式
- 使用原生Servlet
- 使用map集合，本质是map的内容放在request作用域中，spring通过BindingAwareModelMap进行实例化
- 使用SpringMVC中的Model接口，本质是把内容放在request作用域中
- 使用SpringMVC中ModelAndView类，本质同上，方法体中实例化ModelAndView的对象（传页面路径），返回值为该对象（含有视图功能）


#### 文件下载 
访问资源时，如果响应头没有设置Content-Disposition，浏览器默认按inline值处理 
- inline能显示就显示，不能显示才下载
- 修改Content-Disposition即可。
    - 设置响应头：response.setHeader("Content-Disposition","attachment;filename=文件名");attachment是指以附件形式下载