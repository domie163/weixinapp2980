const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmcxll6/",
            name: "ssmcxll6",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmcxll6/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "大学生就业平台微信小程序"
        } 
    }
}
export default base
