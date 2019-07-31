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

Ctrl+shift+v：抽出实例

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

ctrl+alt+p：从方法中抽出变量至参数列表

### 思路：
1. 由页面路径创建controller，controller内方法（返回值为该页面）接收前端信息，并将数据传到页面（model）

2. 由方法创建mapper，mapper中定义含sql注解的接口
（若页面元素不止一张表的内容，则用dto创建新表关联两表，再提取出service，在service中先创建该方法，再在mapper中创建）

3. 编写页面