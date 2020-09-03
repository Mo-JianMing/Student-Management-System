<template>
  <div>
      <h3>修改信息</h3>
      <form action="">
          学号：<input type="text" v-model="emp.Stu_id" ><br><br>
          学年：<input type="text" v-model="emp.S_year" ><br><br>
          姓名：<input type="text" v-model="emp.S_name" ><br><br>
          性别：<input type="text" v-model="emp.S_sex"><br><br>
          专业：<input type="text" v-model="emp.Specialty"><br><br>
          <input type="button" @click="updata()" value="确定">
          <input type="button" @click="cancel()" value="取消">
      </form>  
  </div>
</template>

<script type="text/javascript">
export default {
  name: "upd",
  data() {
    return {
        emp:{
            Stu_id:'',S_year:'',S_name:'',S_sex:'',Specialty:''
        }
    }
  },
  created(){
      this.finsh()
  },
  methods: {
      updata(){
          this.$http.post("http://localhost:2020/crud/upd",this.emp).then(res=>{
              this.$router.push("/studs")
          })
      },
      cancel(){
        this.$router.push("/studs")
      },
      finsh(){
        this.emp.Stu_id = this.$route.query.id
        this.emp.S_year = this.$route.query.year
        this.emp.S_name = this.$route.query.name
        this.emp.S_sex = this.$route.query.sex
        this.emp.Specialty = this.$route.query.spec
      }
  },
  watch:{
    $route:{
      handler:function(val,oldVal){
          if(val.query.id!=oldVal.query.id){
              this.finsh()
          }
      },
      deep:true
    }
  }
}
</script>

<style>
</style>
