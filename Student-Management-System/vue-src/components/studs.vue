<template>
  <div>
      <h1>这里是学生管理系统</h1>
      <table border="1px" style="color:blue">
        <tr>
          <th>学号</th>
          <th>学年</th>
          <th>姓名</th>
          <th>性别</th>
          <th>专业</th>
          <th>操作</th>
        </tr>
        <tr v-for="value in students" :key="value.stu_id">
          <td>{{value.stu_id}}</td>
          <td>{{value.s_year}}</td>
          <td>{{value.s_name}}</td>
          <td>{{value.s_sex}}</td>
          <td>{{value.specialty}}</td>
          <td>&nbsp;<a href="" @click.prevent="del(value.stu_id)">删除</a>&emsp;
              <a :href="'#/studs/upd?id='+value.stu_id+
                        '&year='+value.s_year+
                        '&name='+value.s_name+
                        '&sex='+value.s_sex+
                        '&spec='+value.specialty">修改</a>&nbsp;
          </td>
        </tr>
      </table> 
      <br><a href="#/studs/add">添加</a>
      <router-view/>
  </div>
</template>

<script type="text/javascript">
export default {
  name: "studs",
  data() {
    return {
      students:[]
    }
  },
  components: {},
  created(){
      this.sel()
  },
  watch:{
    $route:{
      handler:function(val){
        if(val.path=='/studs'){
          this.sel()
        }
      },
      deep:true
    }
  },
  methods: {
    sel(){
      this.$http.get("http://localhost:2020/crud/sel").then((res)=>{
        this.students=res.data
      })
    },
    del(id){
      this.$http.get("http://localhost:2020/crud/del?id="+id).then((res)=>{
        this.sel()
      })
    }
  }
}
</script>

<style>
</style>
