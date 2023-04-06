<template>
  <div class="Mhome">
    <!-- 轮播图 -->
    <div class="block">
      <span class="demonstration"></span>
      <el-carousel height="300px">
        <el-carousel-item v-for="item in 6" :key="item">
          <el-image
            style="height: 300px; width: 100%"
            :src="require('@/static/img/' + item + 's.jpg')"
          ></el-image>
          <h3 class="small">{{ item }}</h3>
        </el-carousel-item>
      </el-carousel>
    </div>
    <!-- 出租推荐内容 -->
    <div class="rent">
      <h1 style="text-align: left; color: #ff3030">出租推荐内容</h1>
      <el-row :gutter="30">
        <el-col :span="6" v-for="id in 4" :key="id">
          <div>
            <!-- 出租展示图 -->
            <h3 style="text-align: center">{{ id }}.jpg</h3>
            <el-image
              class="conImg1"
              :src="require('@/static/img/' + id + '.jpg')"
            ></el-image>
            <div class="Center">
              <p>${{ id }}0000/季</p>
              <el-tag type="danger">待租</el-tag>
              <div style="flex: 1"></div>
              <p style="text-align: right">芜湖{{ id }}</p>
            </div>
            <div class="Center" style="height: 25px">
              <p style="font-size: 120%">出租{{ id }}台</p>
              <el-link style="font-size: 120%" type="danger" :underline="false"
                >{{ id }}装备</el-link
              >
            </div>
          </div>
        </el-col>
      </el-row>
    </div>
    <!-- 需求推荐内容 -->
    <div class="need">
      <h1 style="text-align: left; color: #ff3030">需求推荐内容</h1>
      <el-row :gutter="30">
        <el-col :span="8" v-for="id in 3" :key="id">
          <div>
            <!-- 需求展示图 -->
            <el-card
              shadow="hover"
              style="background-color: rgba(84, 255, 159, 0.6)"
            >
              <h3 style="text-align: center; margin: 0">{{ id }}.jpg</h3>
              <el-image
                class="conImg2"
                :src="require('@/static/img/' + (10-id) + '.jpg')"
              ></el-image>
              <div class="Center">
                <p>${{ id }}4853/月</p>
                <el-tag type="danger">待租</el-tag>
                <div style="flex: 1"></div>
                <p style="text-align: right">南京{{ id }}</p>
              </div>
              <div class="Center" style="height: 25px">
                <p style="font-size: 120%">需求{{ id }}台</p>
                <el-link
                  style="font-size: 120%"
                  type="danger"
                  :underline="false"
                  >{{ id }}装备</el-link
                >
              </div>
            </el-card>
          </div>
        </el-col>
      </el-row>
    </div>
    <!-- 数据分析统计 -->
    <div class="dataAnal" style="display: flex; flex-direction: column">
      <h1 style="text-align: left; color: #ff3030">数据分析统计</h1>
      <!-- Echarts图 -->
      <div style="display: flex; align-items: center; justify-content: center">
        <div id="main" style="height: 500px; width: 500px"></div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      myChart: "",
      // data: this.getRandomData(),
    };
  },
  computed() {},
  created() {
    setInterval(() => {
      this.myChart.setOption(this.getRandomData());
      console.log(this.myChart);
    }, 3000);
  },
  mounted() {
    this.drawMychart();
  },
  methods: {
    getRandomData() {
      return {
        series: [
          {
            type: "pie",
            data: [
              {
                value: Math.random() * 100,
                name: "重型设备",
              },
              {
                value: Math.random() * 100,
                name: "实验仪器",
              },
              {
                value: Math.random() * 100,
                name: "动力设备",
              },
              {
                value: Math.random() * 100,
                name: "轻型设备",
              },
            ],
          },
        ],
      };
    },
    drawMychart() {
      // 基于准备好的dom，初始化echarts实例
      this.myChart = this.$echarts.init(document.getElementById("main"));
      // 绘制图表
      this.myChart.setOption(this.getRandomData());
    },
  },
};
</script>

<style scoped>
.Mhome {
  margin-left: 100px;
  margin-right: 100px;
}
.el-carousel__item h3 {
  text-align: center;
  color: #475669;
  font-size: 20px;
  opacity: 0.75;
  line-height: 300px;
  margin: 0;
}
.rent {
  height: 450px;
  display: flex;
  flex-direction: column;
}
.need {
  height: 540px;
  display: flex;
  flex-direction: column;
}
.dataAnal {
  height: 700px;
  display: flex;
  flex-direction: column;
  /* text-align: center; */
  /* line-height: 300px; */
}
.el-header {
  background-color: #b3c0d1;
  color: #333;
  text-align: center;
  line-height: 60px;
}
.el-main {
  /* background-color: #421c68; */
  color: #333;
  text-align: center;
  line-height: 160px;
}
.el-row {
  margin-bottom: 10px;
}
.el-col {
  border-radius: 4px;
  height: 100px;
}
.bg-purple {
  background: #d3dce6;
}
.grid-content {
  border-radius: 4px;
  height: 100px;
}
.row-bg {
  padding: 10px 0;
  background-color: #f9fafc;
}
.conImg1 {
  height: 200px;
  width: 100%;
}
.conImg2 {
  height: 280px;
  width: 100%;
}

.Center {
  display: flex;
  align-items: center;
  /* justify-content: center; */
}
</style>