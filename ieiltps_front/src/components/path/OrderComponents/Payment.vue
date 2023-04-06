<template>
  <div>
    <el-table
      ref="multipleTable"
      :data="tableData"
      tooltip-effect="dark"
      style="width: 100%"
      @selection-change="handleSelectionChange"
    >
      <el-table-column type="selection" width="55"> </el-table-column>
      <el-table-column label="日期" width="120">
        <template slot-scope="scope">{{ scope.row.date }}</template>
      </el-table-column>
      <el-table-column label="展示图" width="240">
        <!-- height: 240px; -->
        <template slot-scope="scope"
          ><el-image
            style="width: 100%"
            :src="require('@/static/img/' + scope.row.imgurl + '.jpg')"
          ></el-image
        ></template>
      </el-table-column>
      <el-table-column prop="name" label="名称" width="120"> </el-table-column>
      <el-table-column prop="type" label="类型" width="120"> </el-table-column>
      <el-table-column prop="address" label="地址" show-overflow-tooltip>
      </el-table-column>
      <el-table-column label="操作">
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)"
            >编辑</el-button
          >
          <el-button
            size="mini"
            type="danger"
            @click="handleDelete(scope.$index, scope.row)"
            >删除</el-button
          >
        </template>
      </el-table-column>
    </el-table>
    <div style="margin-top: 20px">
      <el-button @click="toggleSelection([tableData[1], tableData[2]])"
        >结算</el-button
      >
      <el-button @click="toggleSelection()">取消选择</el-button>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      tableData: [
        {
          date: "2016-05-03",
          name: "钢丝绳电铲",
          address: "上海市普陀区金沙江路 1518 弄",
          type: "重型设备",
          imgurl: "2",
        },
        {
          date: "2016-05-02",
          name: "轮式自行铲运机",
          address: "上海市普陀区金沙江路 1518 弄",
          type: "重型设备",
          imgurl: "6",
        },
        {
          date: "2016-05-04",
          name: "轮式装载机",
          address: "上海市普陀区金沙江路 1518 弄",
          type: "重型设备",
          imgurl: "4",
        },
        {
          date: "2016-05-01",
          name: "非道路用卡车",
          address: "上海市普陀区金沙江路 1518 弄",
          type: "运输设备",
          imgurl: "5",
        },
      ],
      multipleSelection: [],
    };
  },

  methods: {
    toggleSelection(rows) {
      if (rows) {
        rows.forEach((row) => {
          this.$refs.multipleTable.toggleRowSelection(row);
        });
      } else {
        this.$refs.multipleTable.clearSelection();
      }
    },
    handleSelectionChange(val) {
      this.multipleSelection = val;
    },
    handleEdit(index, row) {
      console.log(index, row);
    },
    handleDelete(index, row) {
      console.log(index, row);
    },
  },
};
</script>
<style scoped>
</style>