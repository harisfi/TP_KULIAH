const vm = new Vue({
    el: '#app',
    data: {
        boolType: true,
        numType: 12345,
        strType: 'hello world!',
        arrType: [1, 2, 3, 4, 5],
        withTxt: 'Dengan v-text',
        withHtml: '<b style="color: blue;">Dengan v-html</b>',
        hidden: false
    },
});