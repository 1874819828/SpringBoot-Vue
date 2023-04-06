<template>
  <div>
    <h1 style="background-color: rgba(54, 34, 73, 0.3); margin-top: 0">
      列表大全
    </h1>
    <div class="List1">
      <!-- 面包屑 -->
      <div>
        <el-breadcrumb separator-class="el-icon-arrow-right">
          <el-breadcrumb-item :to="{ path: '/Template/List' }"
            >首页</el-breadcrumb-item
          >
          <el-breadcrumb-item>活动管理</el-breadcrumb-item>
          <el-breadcrumb-item>活动列表</el-breadcrumb-item>
          <el-breadcrumb-item>活动详情</el-breadcrumb-item>
        </el-breadcrumb>
      </div>
      <!-- 筛选条件大全 -->
      <div class="FiCr">
        <div v-for="id in SelectCondition" :key="id">
          <div>{{ id.name }}</div>
          <div>
            <div v-for="item in id.Data" :key="item">
              <el-link :underline="false">{{ item }}</el-link>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- 筛选排序选择 -->
    <div>
      <el-tabs v-model="activeName" type="card" @tab-click="handleClick">
        <el-tab-pane label="默认排序" name="first"
          ><Product></Product>
        </el-tab-pane>
        <el-tab-pane label="发布时间" name="second"
          ><Product></Product
        ></el-tab-pane>
        <el-tab-pane label="租金" name="third"><Product></Product></el-tab-pane>
        <el-tab-pane label="出长时间" name="fourth"
          ><Product></Product
        ></el-tab-pane>
      </el-tabs>
    </div>
    <div style="display: flex; align-items: center; justify-content: center">
      <el-pagination background layout="prev, pager, next" :total="1000">
      </el-pagination>
    </div>
  </div>
</template>
<script>
import Product from "@/components/path/ListComponents/Product.vue";
export default {
  data() {
    return {
      activeName: "first",
      SelectCondition: [
        {
          name: "省份",
          Data: ["四川省", "湖北省", "湖南省", "河北省", "河南省"],
        },
        {
          name: "类型",
          Data: ["挖掘机械", "土方机械", "起重机械", "动力设备"],
        },
        {
          name: "租金区间",
          Data: ["5千元以下", "5千~1万", "1万~5万", "10万以上"],
        },
        {
          name: "设备机龄",
          Data: ["1年以下", "1年~3年", "3年~6年", "10年以上"],
        },
        {
          name: "工作小时",
          Data: ["500h以内", "500h~2000h", "2000h~10000h", "10000h以上"],
        },
      ], //选择条件


      Address: ["四川省", "湖北省", "湖南省", "河北省", "河南省"], //省份
      type: "", //类型
      money: "", //租金区间
      timeUsed: "", //设备机龄
      hours: "", //工作小时
    };
  },
  components: {
    Product,
  },
  methods: {
    handleClick(tab, event) {
      console.log(tab, event);
    },
  },
  created() {
    // console.log(this.SelectCondition)
  },
  mounted() {
    // console.log(this.SelectCondition);
  },
  computed: {},
};
</script>
<style scoped>
.List1 {
  height: 350px;
  /* margin-top: 10px; */
}
.FiCr {
  display: flex;
  flex-direction: column;
  margin-top: 20px;
}
.FiCr > div {
  display: flex;
  /* background-color: aquamarine; */
  border: 1px solid #919191;
  /* height: 20%; */
  /* flex-direction: row; */
}
.FiCr > div > div:nth-of-type(1) {
  width: 20%;
  display: flex;
  align-items: center;
  justify-content: center;
  background-color: rgba(0, 255, 255, 0.3);
}
.FiCr > div > div:nth-of-type(2) {
  display: flex;
  flex-wrap: wrap;
  /* float: left; */
  align-items: center;
}
.FiCr > div > div:nth-of-type(2) > div {
  margin-top: 4px;
  margin-bottom: 4px;
  margin-left: 10px;
  margin-right: 10px;
}
</style>