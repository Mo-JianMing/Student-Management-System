<template>
  <div>
      <h3>添加学生</h3>
      <form action="">
          <input type="text" v-model="Student.Stu_id" placeholder="三位学号：555"><br><br>
          <input type="text" v-model="Student.S_year" placeholder="学年：2020"><br><br>
          <input type="text" v-model="Student.S_name" placeholder="姓名：张三"><br><br>
          <input type="text" v-model="Student.S_sex" placeholder="性别：女"><br><br>
          <input type="text" v-model="Student.Specialty" placeholder="专业：不宕机"><br><br>
          <input type="button" @click="save()" value="确定">
          <input type="button" @click="cancel()" value="取消">
      </form>  
  </div>
</template>

<script type="text/javascript">
export default {
  name: "add_stud",
  data() {
    return {
        Student:{}
    }
  },
  components: {},
  methods: {
      save(){
          this.$http.post("http://localhost:2020/crud/add",this.Student).then(res=>{
              this.$router.push("/studs")
          })
      },
      cancel(){
        this.$router.push("/studs")
      }
  }
}
</script>

<style>
</style>
