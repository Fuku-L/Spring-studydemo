// 定义模块 acctionApp 并且要依赖于模块 ngRoute
var actionApp = angular.module('actionApp',['ngRoute']);

// 配置路由，并注入 $routeProvider 来配置
/** 对应参数解释：
     /oper: 路由名称
     controller: 路由控制器名称
     templateUrl: 视图真正地址
 */
actionApp.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/oper', {
        controller: 'View1Controller',
        templateUrl: 'views/view1.html',
    }).when('/directive',  {
        controller: 'View2Controller',
        templateUrl: 'views/view2.html',
    });
    }]);