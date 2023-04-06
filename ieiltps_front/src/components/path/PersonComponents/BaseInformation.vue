<template>
  <div style="display: flex; justify-content: center">
    <div style="width: 50%">
      <el-form
        ref="userForm"
        :rules="rules"
        :model="userInfo"
        label-position="left"
        label-width="80px"
      >
        <el-form-item label="id" prop="id">
          <el-input v-model="userInfo.id"></el-input>
        </el-form-item>
        <el-form-item label="名称" prop="name">
          <el-input v-model="userInfo.name"></el-input>
        </el-form-item>
        <el-form-item label="性别" prop="sex">
          <el-select
            v-model="userInfo.sex"
            placeholder="请选择性别"
            style="width: 100%"
          >
            <el-option label="男" value="man"></el-option>
            <el-option label="女" value="woman"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="生日" prop="date">
          <el-date-picker
            type="date"
            placeholder="选择日期"
            v-model="userInfo.date"
            style="width: 100%"
          ></el-date-picker
        ></el-form-item>
        <el-form-item label="住址" prop="address">
          <el-input v-model="userInfo.address"></el-input>
        </el-form-item>
        <el-form-item label="描述" prop="desc">
          <el-input v-model="userInfo.desc" placeholder="请输入内容"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="submitForm('userForm')"
            >保存</el-button
          >
          <el-button @click="resetForm('userForm')">重置</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      userInfo: {
        name: "云瑶",
        sex: "男",
        id: "23156",
        address: "安徽宣城",
        desc: "唱跳rap篮球",
        date: "2021-3-5",
      },

      rules: {
        id: [
          { required: true, message: "请输入id", trigger: "blur" },
          { min: 3, max: 5, message: "长度在 3 到 5 个字符", trigger: "blur" },
        ],
        name: [
          { required: true, message: "请输入姓名", trigger: "blur" },
          { min: 2, max: 5, message: "长度在 2 到 5 个字符", trigger: "blur" },
        ],
        sex: [{ required: true, message: "请选择性别", trigger: "change" }],
        date: [
          {
            // type: "date",
            required: true,
            message: "请选择日期",
            trigger: "change",
          },
        ],
        address: [{ required: true, message: "请输入地址", trigger: "blur" }],
        desc: [{ message: "请填写描述", trigger: "blur" }],
      },
    };
  },
  components: {},
  mounted: {},
  created() {},
  computed: {},
  methods: {
    submitForm(formName) {
      //   alert("submit!");
      this.$refs[formName].validate((valid) => {
        if (valid) {
          alert("submit!");
          console.log("submit!");
          console.log(this.$refs[formName].$options.propsData.model);
          this.userInfo = this.$refs[formName].$options.propsData.model;
          console.log(this.userInfo);
        } else {
          console.log("error submit!!");
          return false;
        }
      });
      //   alert("submit!");
    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    },
  },
};
</script>


<style scoped>
</style>