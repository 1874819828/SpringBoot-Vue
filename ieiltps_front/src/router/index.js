import VueRouter from 'vue-router'
import Vue from 'vue'

import Template from '@/view/Template';

import Mhome from '@/components/path/Mhome';
import List from '@/components/path/List';
import Person from '@/components/path/Person';
import OrderManager from '@/components/path/OrderManager';

import Login from '@/view/Login';
import Register from '@/view/Register';
import Backstage from '@/view/Backstage';


//将VueRouter设置为Vue的插件
Vue.use(VueRouter)

const router = new VueRouter({
    // 指定hash属性与组件的对应关系
    routes: [
        { path: '/', redirect: '/template/mhome' },
        {
            path: '/template', name: 'Template', component: Template,
            children: [
                { path: "mhome", name: 'Mhome', component: Mhome },
                { path: "ordermanager", name: 'OrderManager', component: OrderManager },
                { path: "list", name: 'List', component: List },
                { path: "person", name: 'Person', component: Person },
            ]
        },
        { path: '/login', name: 'Login', component: Login },
        { path: '/register', name: 'Register', component: Register },
        { path: '/backstage', name: 'Backstage', component: Backstage },


        // { path: '/', redirect: '/Person'},
        // { path: '/Person', component: Person}

    ]
})

export default router