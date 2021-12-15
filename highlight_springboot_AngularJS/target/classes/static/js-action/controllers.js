actionApp.controller('View1Controller',['$rootScope', '$scope', '$http', function ($rootScope, $scope, $http) {
    $scope.$on('$viewContentLoaded',function (){
        console.log('view1.html 页面加载完成。。。。');
    });
    $scope.search = function (){
        personName = $scope.personName;
        $http.get('search', { // 向服务器发送get请求
            params: {personName: personName} // 增加请求参数
        }).success(function (data){ // 请求成功后的回调
            $scope.person = data; // 将返回的数据 data 通过 $scope.person 赋给模型 person，
        })
    }
}]);

actionApp.controller('View2Controller',['$rootScope', '$scope', function ($rootScope, $scope) {
    $scope.$on('$viewContentLoaded', function (){
        console.log('view2.html 页面加载完成。。。。');
    });
}]);