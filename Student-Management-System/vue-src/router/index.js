import Vue from 'vue'
import Router from 'vue-router'
import ind from '@/components/ind'
import studs from '@/components/studs'
import add_stud from '@/components/add_stud'
import upd from '@/components/upd'

Vue.use(Router)

export default new Router({
  routes: [
    {path:"/",redirect:'/ind'},
    {path:"/ind",component:ind},
    {
      path:"/studs",component:studs,
      children:[
       {path:"add",component:add_stud},
       {path:"upd",component:upd}
      ]
    },
  ]
})
