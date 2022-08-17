####问题：File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
####问题：maven报错：不再支持源选项 5。请使用 6 或更高版本。
~~~
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.encoding>UTF-8</maven.compiler.encoding>
        <java.version>11</java.version>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
    </properties>
~~~
